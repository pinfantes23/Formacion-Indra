package com.indra.formacion.repository;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.indra.formacion.models.Persona;

@Repository
public class PersonaRepository {
	
	public static final String PERSONA_KEY = "PERSONA";
	 
    private HashOperations hashOperations;
 
    private RedisTemplate redisTemplate;
 
    public PersonaRepository(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
        this.hashOperations = this.redisTemplate.opsForHash();
    }
 
    public void save(Persona p) {
        hashOperations.put(PERSONA_KEY, p.getId(), p);
    }
 
    public List findAll(){
        return hashOperations.values(PERSONA_KEY);
    }
 
    public Persona findById(String id) {
        return (Persona) hashOperations.get(PERSONA_KEY, id);
    }
 
    public void update(Persona persona) {
        save(persona);
    }
 
    public void delete(String id) {
        hashOperations.delete(PERSONA_KEY, id);
    }
 
}
