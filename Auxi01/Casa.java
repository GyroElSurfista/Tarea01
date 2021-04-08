public class Casa
{
  String propietarios;
  int pisos;
  int dormitorios;
  int cocinas;
  int banos;
  int jardines;
  int comedores;
  
  public Casa(String duenos, int pisos, int dormitorios,int cocinas, int banos, int jardines, int comedores){
      propietarios = duenos;
      this.pisos = pisos;
      this.dormitorios = dormitorios;
      this.cocinas = cocinas;
      this.banos = banos;
      this.jardines = jardines;
      this.comedores = comedores;
    }
    
  String getPropietarios(){
     return propietarios;
    }
  int getPisos(){
     return pisos;
    }  
  int getDormitorios(){
     return dormitorios;
    }
  int getbanos(){
     return banos;
    }
  int getJardines(){
     return jardines;
    }
    
  void setPropietarios(String duenos){
     propietarios = duenos;  
    }
  void setPisos(int pisos){
     this.pisos = pisos; 
    }  
  void setDormitorios(int dormitorios){
     this.dormitorios = dormitorios;
    }
  void setbanos(int banos){
     this.banos = banos;
    }
  void setJardines(int jardines){
     this.jardines = jardines;
    }
  
  boolean esHabitable(){
      boolean esHabitable;
      esHabitable = false;
      if(dormitorios >= 1 && cocinas >=1 && banos >= 1){
         esHabitable = true;
        }
      return esHabitable;
    }  
  
  boolean puedeSerRestaurante(){
      boolean esRestaurante;
      esRestaurante = false;
      if(cocinas >=1 && banos >=1 && comedores >=1){
        esRestaurante = true;     
      }  
      return esRestaurante;
    }  
    
  boolean requiereJardinero(){
      boolean hayJardinero;
      hayJardinero = false;
      if( jardines > 1){
         hayJardinero = true;
        }
      return hayJardinero;
    }
    
  double cotizarHogar(){
     double precioCasa;
     double pPisos = 200000, pCocinas = 70000, pDormitorios = 80000, pbanos = 50000, pJardines = 120000;
     
     precioCasa = pPisos * pisos + pCocinas * cocinas + pDormitorios * dormitorios + pbanos * banos + pJardines * jardines;
     return precioCasa;
    }
}



