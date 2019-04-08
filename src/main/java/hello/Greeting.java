package hello;

import java.util.ArrayList;
import java.util.List;

public class Greeting {

    private long id;
    private String content;

    List<String> list = new ArrayList<>();

  //Return copy of the list
  public List<String> getList() {
      return new ArrayList<>(list);
  }
  
  public void setList(List<String> listToBeSet) {
	    if (listToBeSet != null)
	        this.list.addAll(listToBeSet);
	}
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
