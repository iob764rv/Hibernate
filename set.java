public class set  implements java.io.Serializable {


     private Short id;
     private String message;

    public set() {
    }

    public set(String message) {
       this.message = message;
    }
   
    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }




}
