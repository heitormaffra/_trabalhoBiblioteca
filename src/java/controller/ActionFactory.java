
package controller;


public class ActionFactory {
    
 // metodo que realiza a criação da instância de uma classe
    
  public static Action create(String action){
    Action actionObject= null;
   
    /*está concatenando o pacote + Action (padrão de nomenclarura) + o nome da classe 
    que será passado por parametro */
    String nomeClasse = "action." + "Action" + action ;
    
    Class classe = null;
    Object object = null;
    
    try {
      classe = Class.forName(nomeClasse);
      object = classe.newInstance();
    } catch (Exception ex) {
      return null;
    }
    
    if(!(object instanceof Action)) return null;
    actionObject = (Action) object;
    return actionObject;
  }
    
}
