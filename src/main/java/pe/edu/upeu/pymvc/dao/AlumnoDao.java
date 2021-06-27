package pe.edu.upeu.pymvc.dao;

import java.util.List;

import pe.edu.upeu.pymvc.model.Alumno;

public interface AlumnoDao {
	int create(Alumno r);
	int update(Alumno r);
	int delete(int id);
	Alumno read(int id);
	List<Alumno> readAll();
}
