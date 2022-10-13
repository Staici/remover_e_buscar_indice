import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
  ArrayList lista = new ArrayList();
    lista.add("Marciano");
    lista.add("Lucas");
  lista.add("Luiza");
    lista.add("Rosa");
    lista.add("Flora");

int posicao=-1;
    for(int i=0; i<lista.size();i++){
      if(lista.get(i).equals("Lucas"))
posicao=i;
    }
if (posicao!=-1)
    lista.remove(posicao);

    for(int i=0;i<lista.size();i++)
      System.out.println(lista.get(i));
    
    }
}