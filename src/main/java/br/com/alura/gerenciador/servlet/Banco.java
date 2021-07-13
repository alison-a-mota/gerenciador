package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    public void adiciona(Empresa empresa) {
        lista.add(empresa);
    }

    // Populando o banco para realizar testes
    static {
        Empresa empresa1 = new Empresa();
        empresa1.setNome("Alura");
        Empresa empresa2 = new Empresa();
        empresa2.setNome("Caelum");
        lista.add(empresa1);
        lista.add(empresa2);

    }

    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }
}
