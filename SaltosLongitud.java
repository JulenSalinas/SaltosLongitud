public class SaltosLongitud{
    public static void main(String[] args) {
        double[][] saltos = {
            {6.80, 7.12, 0.00, 7.95, 0.00, 8.05},
            {7.50, 7.20, 7.85, 0.00, 7.22, 8.10},
            {7.02, 0.00, 7.90, 7.25, 8.01, 0.00},
            {0.00, 7.15, 7.78, 8.15, 7.20, 0.00},
            {7.35, 7.50, 0.00, 8.25, 0.00, 7.95},
            {0.00, 7.80, 7.10, 8.00, 7.60, 7.20},
            {7.00, 7.30, 0.00, 7.40, 8.10, 7.22},
            {7.85, 7.40, 0.00, 7.95, 0.00, 7.98},
            {7.20, 7.70, 7.30, 8.05, 8.10, 0.00},
            {0.00, 7.90, 8.23, 7.80, 0.00, 7.85}
        };
        
       
        double ganador = saltos[0][0];
		int posmaxFila = 0;
		int posmaxColumna = 0;
		
		
		for(int i=0;i<saltos.length;i++) {
			for(int j=0;j<saltos[i].length;j++) {
				if(saltos[i][j] > ganador) {
				ganador = saltos[i][j];
				posmaxFila = (i + 1);
				posmaxColumna = (j + 1);
				}
			}
		}
		
		System.out.println("Ejercico 1:");
		System.out.println("\n");
		System.out.println("El ganador ha hecho un salto de : " + ganador);
		System.out.println("El atleta ganador es el atleta nº " + posmaxFila);
		System.out.println("El atletla logró esa azaña en el intento nº " + posmaxColumna);
		
		System.out.println("\n");
		
		
		System.out.println("Ejercico 2:");
		System.out.println("\n");
		
		int cantidadNulos = 0;
		double porcentajeNulos = 0 ;
		  for(int i=0;i<saltos.length;i++)
			for(int j=0;j<saltos[i].length;j++) {
			  if(saltos[i][j] == 0.00 )
				 cantidadNulos = cantidadNulos + 1 ;
			  	 porcentajeNulos = (double) cantidadNulos /(saltos.length * saltos[0].length) * (100);
			}

		System.out.println("El porcentaje de nulos de todos los saltos de la tabla es: " + porcentajeNulos);
		System.out.println("\n");
		  
		System.out.println("Ejercico 3:");
		System.out.println("\n");
		
		int cantidadNulo = 0;
		int cantidadTotalNulos = 0;
		  for(int i=0;i<saltos.length;i++) {
			for(int j=0;j<saltos[i].length;j++) {
			  if(saltos[i][j] == 0.00 ) {
				 cantidadTotalNulos = cantidadTotalNulos + 1 ;
				 cantidadNulo = cantidadNulo + 1 ;
			  }
			}
			System.out.println("El atleta " +(i+1) + " "+ "tiene " + " "+cantidadNulo +" cantidad de saltos nulos");
			cantidadNulo = 0;
		  }
		System.out.println("\n");
		System.out.println("Cantidad de saltos nulos total: " + cantidadTotalNulos);
		System.out.println("\n");
		
		
		System.out.println("Ejercico 4:");
		System.out.println("\n");
		
		for(int i=0;i<saltos.length;i++) {
			double mejorSalto = saltos[i][0];
			for(int j=0;j<saltos[i].length;j++) 
				if(saltos[i][j] > mejorSalto) 
				mejorSalto = saltos[i][j];
			System.out.println("El mejor salto del atleta " + (i + 1) + " es: " + mejorSalto);	
		}
		
		System.out.println("\n");
		System.out.println("Ejercico 5:");
		System.out.println("\n");
		
		double porcentajeNulo = 0 ;
		  for(int i=0;i<saltos.length;i++) {
			  int nulosAtleta = 0 ;
			  for(int j=0;j<saltos[i].length;j++) {
				  if(saltos[i][j] == 0.00 ) 
					nulosAtleta++;
				  	porcentajeNulo = (double) nulosAtleta /(saltos[i].length) * (100);
				  	
			  }
				System.out.println("El atleta " + (i + 1) + " tiene : " + porcentajeNulo + " porcentaje de saltos nulos");	

		  }
		System.out.println("\n");
		System.out.println("Ejercico 6:");
		System.out.println("\n");
			
	    double max1 = saltos[0][0];
	    double segundoMax = saltos[0][0];
	    double tercerMax = saltos[0][0]; 

		for (int i = 0; i < saltos.length; i++) {
			for (int j = 0; j < saltos[i].length; j++) {
			     if (saltos[i][j] > max1) {
			          segundoMax = max1;
			          tercerMax = max1;
			          max1 = saltos[i][j];

			     } else if (saltos[i][j] > segundoMax && saltos[i][j] != max1) {
			            	segundoMax = saltos[i][j];
			       }
			      else if (saltos[i][j] > tercerMax && saltos[i][j] != segundoMax) {
			            	tercerMax = saltos[i][j];
			      }
			          
			 }
		}
		System.out.println("El mejor salto ha sido: " + max1);
		System.out.println("El segundo mejor salto ha sido: " + segundoMax);
		System.out.println("El Tercer mejor salto ha sido: " + tercerMax);
			    
		System.out.println("\n");
		System.out.println("Ejercico 7:");
		System.out.println("\n");
				
			//No he podido hacer el ejercico 7, pese a intentar seguir el mismo 'fromato' del ejercico 6, no he conseguido que se mostrase el ranking entero
						
    }
}
