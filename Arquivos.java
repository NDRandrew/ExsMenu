import java.io.*;
import java.util.*;

class Arquivos{
  public void createFile(String path){
    try{
      File arq = new File(path);
      if(arq.createNewFile()){
        System.out.println("Arquivo criado " + arq.getName());
      }
      else{
        System.out.println("Aquivo existente ou pasta não é gravável.");
      }

      
    }catch(Exception e){
      System.out.println("Erro");
      e.printStackTrace();
    }
    
  }
  public void writeFile(String path, String texto){
    try{
      FileWriter arq1 = new FileWriter(path,true);
      arq1.write(texto);
      arq1.close(); //necessario fechar o arquivo para que "salve"
    } catch(Exception e){
      System.out.println("Arquivo nao pode ser escrito ");
    }
  }
  public void readFile(String path){
    try{
      FileReader arq2 = new FileReader(path);
      Scanner scr = new Scanner(arq2);
      while(scr.hasNextLine()){
        String linha = scr.nextLine();
        System.out.println(linha);
      }
      
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public void deleteFile(String path){
    try{
      File arq = new File(path);
      if(arq.delete()){
        System.out.println("Arquivo deletado: " + arq.getName());
      }
      else{
        System.out.println("Arquivo nao pode ser apagado. ");
      }
    }catch(Exception e){
      e.printStackTrace();  
    }
  }
  public void createDir(String path){
    try{
      File dir = new File(path);
      if(dir.mkdir()){
        System.out.println("Diretorio criado: "+ dir.getName());
      }
      else{System.out.println("Nao foi possivel criar diretorio");}
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  public void listDir(String path){
    try{
      File arq = new File(path);
      String lista[] = arq.list();
      for (int i=0; i<lista.length;i++){
        System.out.println(lista[i]+"\n");
      }
        
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}