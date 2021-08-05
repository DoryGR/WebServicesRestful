package br.edu.ifgoias.sistemaacademico.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.edu.ifgoias.sistemaacademico.entities.Curso;

public class ListSerializerCurso extends StdSerializer<List<Curso>>{

	private static final long serialVersionUID = 1L;

	public ListSerializerCurso() {
	        this(null);
	    }

	    public ListSerializerCurso(Class<List<Curso>> lt) {
	        super(lt);
	    }

	    @Override
	    public void serialize(
	      List<Curso> cursos, 
	      JsonGenerator generator, 
	      SerializerProvider provider) 
	      throws IOException, JsonProcessingException {
	        
	        List<Integer> ids = new ArrayList<>();
	        for (Curso curso : cursos) {
	            ids.add(curso.getIdcurso());
	        }
	        generator.writeObject(ids);
	    }
	}