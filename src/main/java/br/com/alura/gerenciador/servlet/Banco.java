package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    public void adiciona(Empresa emprsa) {
        lista.add(emprsa);
    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }
}
