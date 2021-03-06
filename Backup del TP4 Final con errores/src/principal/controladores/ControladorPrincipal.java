package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;

public class ControladorPrincipal 
{
    public static void main(String[] args) 
    {    
     //<editor-fold defaultstate="collapsed" desc="Sin intefaz gráfica"> 
        ArrayList<Grupo> grupos = new ArrayList<>();
//        ArrayList<Alumno> alumnos = new ArrayList<>(); Reemplazada por autores
//        ArrayList<Profesor> profesores = new ArrayList<>(); Reemplazada por autores
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<PalabraClave> palabrasClaves = new ArrayList<>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        //GRUPOS
        Grupo grupo1 = new Grupo("Grupo 1", "Descripcion 1");
        Grupo grupo2 = new Grupo("Grupo 2", "Descripcion 2");
        Grupo grupo3 = new Grupo("Grupo 3", "Descripcion 3");
        Grupo grupo4 = new Grupo("Grupo 4", "Descripcion 4");
        Grupo grupo5 = new Grupo("Grupo 5", "Descripcion 5");
        Grupo grupo6 = new Grupo("Grupo 6", "Descripcion 6");
        Grupo grupo7 = new Grupo("Grupo 4", "Descripcion 6");
        
        if (!grupos.contains(grupo1)) grupos.add(grupo1);
        if (!grupos.contains(grupo2)) grupos.add(grupo2);
        if (!grupos.contains(grupo3)) grupos.add(grupo3);
        if (!grupos.contains(grupo4)) grupos.add(grupo4);
        if (!grupos.contains(grupo5)) grupos.add(grupo5);
        if (!grupos.contains(grupo6)) grupos.add(grupo6);
        if (!grupos.contains(grupo7)) grupos.add(grupo7); //Veo que pasa si hay un grupo con igual nombre
        
        System.out.println("----Grupos----");
        for(Grupo g : grupos)
            g.mostrar();
        //GRUPOS
        
        //ALUMNOS
        Autor alumno1 = new Alumno(1, "Apellido1", "Nombre1", "Clave1", "1");
        Autor alumno2 = new Alumno(2, "Apellido2", "Nombre2", "Clave2", "2");
        Autor alumno3 = new Alumno(3, "Apellido3", "Nombre3", "Clave3", "3");
        Autor alumno4 = new Alumno(4, "Apellido4", "Nombre4", "Clave4", "4");
        Autor alumno5 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5");
        Autor alumno6 = new Alumno(5, "Apellido5", "Nombre5", "Clave5", "5"); //Alumno que repite DNI
        Autor alumno7 = new Alumno(6,"ApellidoCxRepetido","NombreCxRepetido","ClaveCxRepetido","1");
        
        if (!autores.contains(alumno1)) autores.add(alumno1);
        if (!autores.contains(alumno2)) autores.add(alumno2);
        if (!autores.contains(alumno3)) autores.add(alumno3);
        if (!autores.contains(alumno4)) autores.add(alumno4);
        if (!autores.contains(alumno5)) autores.add(alumno5);
        if (!autores.contains(alumno6)) autores.add(alumno6);
        if (!autores.contains(alumno7)) autores.add(alumno7);
       
//        System.out.println("\n----Alumnos----\n");
//        for(Alumno a : alumnos)
//            a.mostrar();
        //ALUMNOS
        //PROFESORES
        Autor profesor1 = new Profesor(10, "Apellido10", "Nombre10", "Clave10", Cargo.TITULAR);
        Autor profesor2 = new Profesor(20, "Apellido20", "Nombre20", "Clave20", Cargo.ASOCIADO);
        Autor profesor3 = new Profesor(30, "Apellido30", "Nombre30", "Clave30", Cargo.ADJUNTO);
        Autor profesor4 = new Profesor(40, "Apellido40", "Nombre40", "Clave40", Cargo.JTP);
        Autor profesor5 = new Profesor(50, "Apellido50", "Nombre50", "Clave50", Cargo.ADG);
        Autor profesor6 = new Profesor(50, "asdasdasd", "Nombre40", "Clave40", Cargo.JTP); //Profesor que repite DNI
        Autor profesor7 = new Profesor(1,"ApellidoDNIRepetido","NombreDNIRepetido","ClaveDNIRepetido",Cargo.ADG); //Profesor que repite DNI con alumno
        if (!autores.contains(profesor1)) autores.add(profesor1);
        if (!autores.contains(profesor2)) autores.add(profesor2);
        if (!autores.contains(profesor3)) autores.add(profesor3);
        if (!autores.contains(profesor4)) autores.add(profesor4);
        if (!autores.contains(profesor5)) autores.add(profesor5);
        if (!autores.contains(profesor6)) autores.add(profesor6);
        if (!autores.contains(profesor7)) autores.add(profesor7);
        
//        System.out.println("\n----Profesores----\n");
//        for(Profesor p : profesores)
//            p.mostrar();

//////////////MUESTRO AUTORES
        System.out.println("\n----Autores----\n");
        for(Autor a: autores)
        {
            a.mostrar();
        }
        //PROFESORES
        
        //TIPOS DE PUBLICACION
        System.out.println("\n----Tipos de publicación----\n");
        Tipo tipo1 = new Tipo("Tipo 1");
        Tipo tipo2 = new Tipo("Tipo 2");
        Tipo tipo3 = new Tipo("Tipo 3");
        Tipo tipo4 = new Tipo("Tipo 4");
        Tipo tipo5 = new Tipo("Tipo 5");
        Tipo tipo6 = new Tipo("Tipo 5");//Tipo con nombre duplicado
        
        if (!tipos.contains(tipo1)) tipos.add(tipo1);
        if (!tipos.contains(tipo2)) tipos.add(tipo2);
        if (!tipos.contains(tipo3)) tipos.add(tipo3);
        if (!tipos.contains(tipo4)) tipos.add(tipo4);
        if (!tipos.contains(tipo5)) tipos.add(tipo5);
        if (!tipos.contains(tipo6)) tipos.add(tipo6);

        for(Tipo t : tipos)
            System.out.println(t);
        //TIPOS DE PUBLICACION
        
        
        
        
        //LUGAR
        System.out.println("\n----Lugares----\n");
        Lugar lugar1 = new Lugar("Lugar 1");
        Lugar lugar2 = new Lugar("Lugar 2");
        Lugar lugar3 = new Lugar("Lugar 3");
        Lugar lugar4 = new Lugar("Lugar 4");
        Lugar lugar5 = new Lugar("Lugar 5");
        Lugar lugar6 = new Lugar("Lugar 5"); //lugar repetido

        if (!lugares.contains(lugar1)) lugares.add(lugar1);
        if (!lugares.contains(lugar2)) lugares.add(lugar2);
        if (!lugares.contains(lugar3)) lugares.add(lugar3);
        if (!lugares.contains(lugar4)) lugares.add(lugar4);
        if (!lugares.contains(lugar5)) lugares.add(lugar5);
        if (!lugares.contains(lugar6)) lugares.add(lugar6);

        for(Lugar lug : lugares)
            System.out.println(lug);
        //LUGAR
        
        
        
        
        
        //IDIOMAS
        System.out.println("\n----Idiomas----\n");
        Idioma idioma1 = new Idioma("Idioma 1");
        Idioma idioma2 = new Idioma("Idioma 2");
        Idioma idioma3 = new Idioma("Idioma 3");
        Idioma idioma4 = new Idioma("Idioma 4");
        Idioma idioma5 = new Idioma("Idioma 5");
        Idioma idioma6 = new Idioma("Idioma 5"); //idioma repetido

        if (!idiomas.contains(idioma1)) idiomas.add(idioma1);
        if (!idiomas.contains(idioma2)) idiomas.add(idioma2);
        if (!idiomas.contains(idioma3)) idiomas.add(idioma3);
        if (!idiomas.contains(idioma4)) idiomas.add(idioma4);
        if (!idiomas.contains(idioma5)) idiomas.add(idioma5);
        if (!idiomas.contains(idioma6)) idiomas.add(idioma6);

        for(Idioma i : idiomas)
            System.out.println(i);        
        //IDIOMAS
        
        
        
        
        //PALABRASCLAVE
        System.out.println("\n----Palabras clave----\n");
        PalabraClave palabraClave1 = new PalabraClave("PalabraClave1");
        PalabraClave palabraClave2 = new PalabraClave("PalabraClave2");
        PalabraClave palabraClave3 = new PalabraClave("PalabraClave3");
        PalabraClave palabraClave4 = new PalabraClave("PalabraClave4");
        PalabraClave palabraClave5 = new PalabraClave("PalabraClave5");
        PalabraClave palabraClave6 = new PalabraClave("PalabraClave5"); //Palabra clave repetida
        
        if (!palabrasClaves.contains(palabraClave1)) palabrasClaves.add(palabraClave1);
        if (!palabrasClaves.contains(palabraClave2)) palabrasClaves.add(palabraClave2);
        if (!palabrasClaves.contains(palabraClave3)) palabrasClaves.add(palabraClave3);
        if (!palabrasClaves.contains(palabraClave4)) palabrasClaves.add(palabraClave4);
        if (!palabrasClaves.contains(palabraClave5)) palabrasClaves.add(palabraClave5);
        if (!palabrasClaves.contains(palabraClave6)) palabrasClaves.add(palabraClave6);
        
        
        for(PalabraClave pc : palabrasClaves)
            System.out.println(pc); 
        //PALABRASCLAVE
        
        /*
        Para un objeto de la clase publicación:
        Titulo
        Miembro en grupo
        Fecha
        Tipo
        Idioma
        Lugar
        Lista de palabras clave
        Enlace
        Resumen
        */
        
        //PUBLICACIONES
        
        for(Autor a : autores)
            a.mostrar();
        //PUBLICACION 1
        MiembroEnGrupo mg1=new MiembroEnGrupo(autores.get(0), grupos.get(0), Rol.ADMINISTRADOR);
        LocalDate fecha1= LocalDate.of(2020, 06, 24);
        ArrayList<PalabraClave> palabras1 =new ArrayList<>();
        palabras1.add(palabraClave1);
        palabras1.add(palabraClave2);
        palabras1.add(palabraClave3);
        Publicacion publicacion1 = new Publicacion("Título 1", mg1, fecha1, tipos.get(0), idiomas.get(0), lugares.get(0), palabras1, "Enlace 1", "Resumen 1");
        //PUBLICACION 1 
        
        //PUBLICACION 2
        ArrayList<PalabraClave> palabras2=new ArrayList<>();
        palabras2.add(palabraClave4);
        palabras2.add(palabraClave5);
        palabras2.add(palabraClave1);
        Publicacion publicacion2 = new Publicacion("Título 2", new MiembroEnGrupo(profesor2, grupo1, Rol.ADMINISTRADOR), LocalDate.of(2020, 06, 24), tipos.get(1), idiomas.get(1), lugares.get(1), palabras2, "Enlace 2", "Resumen 2");
        //PUBLICACION 2
        
        //PUBLICACION 3
        MiembroEnGrupo mg3 = new MiembroEnGrupo(profesor2, grupo2, Rol.COLABORADOR);
        LocalDate fecha3= LocalDate.of(2020, 06, 24);
        ArrayList<PalabraClave> palabras3=new ArrayList<>();
        palabras3.add(palabrasClaves.get(1));
        palabras3.add(palabrasClaves.get(3));
        palabras3.add(palabrasClaves.get(4));
        Publicacion publicacion3 = new Publicacion("Título 3",mg3, fecha3 , tipos.get(0), idiomas.get(1), lugares.get(1), palabras3, "Enlace 3", "Resumen 3");
        //PUBLICACION 3
        
        //PUBLICACION 4
        MiembroEnGrupo mg4 = new MiembroEnGrupo(autores.get(3), grupos.get(3), Rol.COLABORADOR);
        LocalDate fecha4= LocalDate.of(2020, 03, 15);
        ArrayList<PalabraClave> palabras4=new ArrayList<>();
        palabras4.add(palabrasClaves.get(1));
        Publicacion publicacion4 = new Publicacion("Título 4", mg4, fecha4, tipos.get(4), idiomas.get(2), lugares.get(4),palabras4, "Enlace 4", "Resumen 4");
        //PUBLICACION 4
        
        //PUBLICACION 5
        MiembroEnGrupo mg5 = new MiembroEnGrupo(autores.get(4), grupos.get(4), Rol.COLABORADOR);
        LocalDate fecha5= LocalDate.of(2020, 8, 15);
        ArrayList<PalabraClave> palabras5=new ArrayList<>();
        palabras5.add(palabrasClaves.get(2));
        palabras5.add(palabrasClaves.get(3));
        palabras5.add(palabrasClaves.get(4));     
        Publicacion publicacion5 = new Publicacion("Título 5", mg5, fecha5, tipos.get(4), idiomas.get(2), lugares.get(4), palabras5, "Enlace 5", "Resumen 5");
        //PUBLICACION 5
        
         //PUBLICACION 6 Autor:Alumno
        MiembroEnGrupo mg6 = new MiembroEnGrupo(alumno1, grupos.get(5), Rol.COLABORADOR);
        LocalDate fecha6= LocalDate.of(2020, 8, 22);
        ArrayList<PalabraClave> palabras6=new ArrayList<>();
        palabras6.add(palabrasClaves.get(2));
        palabras6.add(palabrasClaves.get(3));
        palabras6.add(palabrasClaves.get(4));     
        Publicacion publicacion6 = new Publicacion("Título 5", mg6, fecha6, tipos.get(2), idiomas.get(2), lugares.get(4), palabras6, "Enlace 6", "Resumen 6");
        //PUBLICACION 6 Autor:Alumno
        
        if (!publicaciones.contains(publicacion1)) publicaciones.add(publicacion1);
        if (!publicaciones.contains(publicacion2)) publicaciones.add(publicacion2);
        if (!publicaciones.contains(publicacion3)) publicaciones.add(publicacion3);
        if (!publicaciones.contains(publicacion4)) publicaciones.add(publicacion4);
        if (!publicaciones.contains(publicacion5)) publicaciones.add(publicacion5);
       if (!publicaciones.contains(publicacion6)) publicaciones.add(publicacion6);
        for(Publicacion p : publicaciones) {
            p.mostrar();
            System.out.println();
        }
        
        /////////Pruebas de parte 3 del TP 4
        
        //1) Autores repetidos en un grupo--->Funciona
        
        System.out.println("----Agrego miembros");
        grupo1.agregarMiembro(profesor1, Rol.ADMINISTRADOR);
        grupo1.agregarMiembro(profesor1, Rol.COLABORADOR); //repetido
        grupo1.agregarMiembro(alumno1, Rol.COLABORADOR);
        grupo1.mostrar();
        
        
        //2) Autor anterior agregado a otro grupo--->Funciona
        
        System.out.println("\n----Agrego autores de dif grupos");
        profesor1.agregarGrupo(grupo2, Rol.COLABORADOR);
        profesor1.agregarGrupo(grupo2, Rol.ADMINISTRADOR); //grupo repetido
        profesor1.mostrar();
        
        
        //3)Quitar un autor y verificar---->Funciona
        System.out.println("\n----Quito miembros");
        grupo1.quitarMiembro(profesor1);
        grupo1.mostrar();
        
        //4)Grupo para superadministradores---->No funciona
        System.out.println("\n----Grupo de superadmins");
        Grupo grupoSuper = new Grupo("Super Administradores","Superadmins");
        if (!grupos.contains(grupoSuper))
            grupos.add(grupoSuper);
        grupoSuper.agregarMiembro(profesor1, Rol.COLABORADOR);//No lo agrega como admin
        grupoSuper.mostrar();
        System.out.println(grupoSuper.esSuperAdministradores());        
        
        //5)Verificar si son grupos de super administradores---->Funciona
        System.out.println("\n----Son grupos de Super Administradores?");
        System.out.println("Grupo Super:");
        System.out.println(grupoSuper.esSuperAdministradores());
        System.out.println("Grupo 2:");
        System.out.println(grupo2.esSuperAdministradores());
        System.out.println("Grupo 1:");
        System.out.println(grupo1.esSuperAdministradores());
        
        //6)El autor agregado a Grupo Super Administrador es SuperAdmin?---->Funciona
        System.out.println("\n----Autor superAdmin?");
        System.out.println("El profesor1: " +profesor1.esSuperAdministrador());
        System.out.println("El alumno1: " +alumno1.esSuperAdministrador());
      //</editor-fold>   
//     <editor-fold defaultstate="collapsed" desc="Intefaz gráfica"> 
////        VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); //se instancia la ventana
////        ventanaGrupo.setLocationRelativeTo(null); //se centra la ventana
////        ventanaGrupo.setVisible(true); //se hace visible la ventana
////        
////        VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
////        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
////        ventanaAlumno.setVisible(true); //se hace visible la ventana
////        
////        VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null); //se instancia la ventana
////        ventanaProfesor.setLocationRelativeTo(null); //se centra la ventana
////        ventanaProfesor.setVisible(true); //se hace visible la ventana        
////        
////        VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); //se instancia la ventana
////        ventanaIdioma.setLocationRelativeTo(null); //se centra la ventana
////        ventanaIdioma.setVisible(true); //se hace visible la ventana                
////        
////        VentanaALugar ventanaLugar = new VentanaALugar(null); //se instancia la ventana
////        ventanaLugar.setLocationRelativeTo(null); //se centra la ventana
////        ventanaLugar.setVisible(true); //se hace visible la ventana                        
////        
////        VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); //se instancia la ventana
////        ventanaPalabraClave.setLocationRelativeTo(null); //se centra la ventana
////        ventanaPalabraClave.setVisible(true); //se hace visible la ventana                                
////        
////        VentanaATipo ventanaTipo = new VentanaATipo(null); //se instancia la ventana
////        ventanaTipo.setLocationRelativeTo(null); //se centra la ventana
////        ventanaTipo.setVisible(true); //se hace visible la ventana   

//     </editor-fold>
    }
}

