package com.back.cookbook.dataac;

import com.back.cookbook.business.Receita;

/* 
 * Inteface DAO (Data Access Object) para realizar operações no banco 
 */
public interface ReceitaDAO {
    public abstract void addReceita(Receita receita);
    //public abstract void deleteReceita(Integer receitaId);
    //public abstract void updateReceitaById(Integer receitaId);
}