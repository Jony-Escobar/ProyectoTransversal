package AccesoADatos;

import Modelo.Materia;
import Modelo.Alumno;
import Modelo.Inscripcion;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion cursada) {

        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setFloat(1, (float) cursada.getNota());
            ps.setInt(2, cursada.getIdAlumno());
            ps.setInt(3, cursada.getIdMateria());
            //ResultSet rs = ps.getGeneratedKeys();
            if (ps.executeUpdate() > 0) {
                // cursada.setIdInscripcion((int) rs.getFloat("idInscripcion"));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "No se puso inscribir.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex.getMessage());
        }
    }

    public ArrayList<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT * FROM inscripcion";
        ArrayList<Inscripcion> allInscripciones = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.setIdAlumno(rs.getInt("idAlumno"));
                insc.setIdMateria(rs.getInt("idMateria"));
                insc.setNota(rs.getFloat("nota"));
                allInscripciones.add(insc);
                System.out.println(insc.toString());
                JOptionPane.showMessageDialog(null, "Listado de materias");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex.getMessage());
        }
        return allInscripciones;
    }

    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
        ArrayList<Inscripcion> inscriptas = new ArrayList(); //= null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripto"));
                insc.setIdAlumno(rs.getInt("idAlumno"));
                insc.setIdMateria(rs.getInt("idMateria"));
                insc.setNota(rs.getFloat("nota"));
                inscriptas.add(insc);

                // System.out.println("Mostrar inscripcion metodo obtener insc por alumno "+insc.toString());
                // Component cmpnt = null;
                // JOptionPane.showMessageDialog(cmpnt, insc.toString());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex.getMessage());
        }
        return inscriptas;

    }

    public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria) {

        String sql = "SELECT alumno.* \n"
                + "FROM inscripcion JOIN alumno ON(inscripcion.idAlumno= alumno.idAlumno)\n"
                + "WHERE inscripcion.idMateria= ?;";
        ArrayList<Alumno> listaAlumnosMateria = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alu = new Alumno();
                alu.setIdAlumno(rs.getInt("idAlumno"));
                alu.setDni(rs.getInt("dni"));
                alu.setApellido(rs.getString("apellido"));
                alu.setNombre(rs.getString("nombre"));
                alu.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alu.setEstado(rs.getInt("estado"));
                listaAlumnosMateria.add(alu); //agrego al arrayList el alumno recuperado en alu
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }
        return listaAlumnosMateria;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM `inscripcion` \n"
                + "WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                Component cmpnt = null;
                JOptionPane.showMessageDialog(cmpnt, "Inscripcion eliminada");
            } else {

                JOptionPane.showMessageDialog(null, "No existía tal inscripción");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion" + ex.getMessage());
        }

    }

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        String sql = "SELECT materia.* \n"
                + "FROM `inscripcion` JOIN materia ON(materia.idMateria=inscripcion.idMateria)\n"
                + "WHERE idAlumno= ? \n"
                + "ORDER BY materia.nombre;";
        ArrayList<Materia> matCursadas = new ArrayList();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getInt("estado"));
                matCursadas.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex.getMessage());
        }
        return matCursadas;
    }

    public ArrayList<Materia> obtenerMateriasNoCursadas(int id) {
        String sql = "SELECT * \n"
                + "FROM materia \n"
                + "WHERE nombre NOT IN(SELECT nombre \n"
                + "FROM inscripcion JOIN materia ON(inscripcion.idMateria= materia.idMateria)\n"
                + "WHERE idAlumno=?)";
        ArrayList<Materia> noCursadas = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                noCursadas.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex.getMessage());
        }
        return noCursadas;
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota= ? WHERE idAlumno= ? AND idMateria= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Carga de nota exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo cargar la nota.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la inscripcion" + ex);
        }
    }

}
