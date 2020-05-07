/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElementosCursos;

import java.util.LinkedList;

/**
 *
 * @author ENK
 */
public class Cursos {
    private Boolean Obligatorio;
    private String Codigo;
    private String Nombre;
    private LinkedList<Cursos> Pre = new LinkedList<Cursos>();
    private int Creditos;
   
    private Cursos SiguienteListaCursos;
    private Cursos AnteriorListaCursos;
    
    private Cursos SiguienteListaPre;
    private Cursos AnteriorListaPre;

    //Dar
   public Cursos(String Codigo, String Nombre,  int Creditos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;      
        this.Creditos = Creditos;
    }
    public void AgregarPre(Cursos Pre){
         this.Pre.add(Pre);      
    }
    
    public void ActualizarPre(LinkedList<Cursos> Prerre){
    this.Pre=Prerre;
    }
    
    public void SigCurso(Cursos Curso) {
        SiguienteListaCursos = Curso;
    }

    public void AntCurso(Cursos Curso) {
        AnteriorListaCursos = Curso;
    }

     public void SigPre(Cursos Curso) {
        SiguienteListaPre = Curso;
      
    }

    public void AntPre(Cursos Curso) {
        AnteriorListaPre = Curso;
        ;
    }
    //Obtener
    public Cursos SigCurso() {
        return SiguienteListaCursos;
    }

    public Cursos AntCurso() {
        return AnteriorListaCursos;
    }

    public Cursos SigPre() {
       return SiguienteListaPre;
       
    }

    public Cursos AntPre() {
        return AnteriorListaPre;
        
    }
    
    public int Creditos() {
        return Creditos;
    }

    public String Codigo() {
        return Codigo;
    }

    public LinkedList<Cursos> Pre() {
        return Pre;
    }

    public String Nombre() {
        return Nombre;
    }
}
