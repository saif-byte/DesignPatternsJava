package Factory_Doc_App;

public class Application {

    public Document createdoc(){
        return new Document();
    }

    public void opendoc(Document d){
        d.open();
    }

    public void savedoc(Document d){
        d.save();
    }

    public void revertdoc(Document d){
        d.revert();


    }


}
