public class ListaSimplesDesordenada <X>
{
  private class No
  {
    private X info;
    private No prox;
  
    public No (X i, No p)
    {
      this.info = i;
      this.prox = p;
    }
    
    public No (X i)
    {
      this.info = i;
      this.prox = null;
    }
    
    public X getInfo()
    {
      return this.info;
    }
    
    public No getProx()
    {
      return this.prox;
    }
    
    public void setInfo(X i)
    {
      this.info = i;
    }
    
    public void setProx (No p)
    {
      this.prox = p;
    }
  }
  // fim da classe Nó
  
  private No primeiro, ultimo;
  
  public void insiraNoInicio(X i) throws Exception
  {
    if(i == null)
      throw new Exception
  }
  
  public
