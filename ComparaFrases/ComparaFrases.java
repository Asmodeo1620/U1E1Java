comparafrases del paquete del paquete ;

importar  java.io. * ;

 clase  pública ComparaFrases {

    public  static  void  main ( String [] args ) lanza  IOException {
        String original =  " es parte de crecer timmy " ; // Aqui cambia la frase ordenada
        String orig [] = original . dividir ( "  " );
        String partes [];
        String aux [] = nuevo  String [orig . longitud];
        String ruta =  " C: /Users/eduar/OneDrive/Documentos/SeptimoSemestre/Prog_Log_Fun/frase.txt " ; // Aqui cambia la ruta del txt
        String frase, oracion = " " , corregida = " " ;
        FileReader fr =  new  FileReader (ruta);
        BufferedReader br =  new  BufferedReader (fr);
        
        while ((frase = br . readLine ()) ! = null ) {
            oracion = frase;
        }
        br . cerca();
        
        partes = oracion . dividir ( "  " );
        if (original . length () == oracion . length ()) {
            for ( int i = 0 ; i < partes . length; i ++ ) {
                for ( int j = 0 ; j < partes . length; j ++ ) {
                    if (partes [i] . es igual a (orig [j])) {
                        aux [j] = partes [i];                    
                    }
                }    
            }
            para ( int i = 0 ; i < aux . length; i ++ ) {
                corregida + = aux [i] + "  " ;
                Sistema . fuera . println (corregida);
            }
        } más {
            Sistema . fuera . println ( " El texto del txt no es el mismo del programa " );
        }
        
    }
    
}
comparafrases;

importar  java.io. * ;

 clase  pública ComparaFrases {

    public  static  void  main ( String [] args ) lanza  IOException {
        String original =  " es parte de crecer timmy " ; // Aqui cambia la frase ordenada
        String orig [] = original . dividir ( "  " );
        String partes [];
        String aux [] = nuevo  String [orig . longitud];
        String ruta =  " C: /Users/eduar/OneDrive/Documentos/SeptimoSemestre/Prog_Log_Fun/frase.txt " ; // Aqui cambia la ruta del txt
        String frase, oracion = " " , corregida = " " ;
        FileReader fr =  new  FileReader (ruta);
        BufferedReader br =  new  BufferedReader (fr);
        
        while ((frase = br . readLine ()) ! = null ) {
            oracion = frase;
        }
        br . cerca();
        
        partes = oracion . dividir ( "  " );
        
        for ( int i = 0 ; i < partes . length; i ++ ) {
            for ( int j = 0 ; j < partes . length; j ++ ) {
                if (partes [i] . es igual a (orig [j])) {
                    aux [j] = partes [i];                    
                }
            }    
        }
        para ( int i = 0 ; i < aux . length; i ++ ) {
            corregida + = aux [i] + "  " ;
            Sistema . fuera . println (corregida);
        }
    }
    
}
