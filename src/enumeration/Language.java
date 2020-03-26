package enumeration;


enum Language {
    JAVA("Languaga JAVA","Eclipse"),
    C("Language C", "Code block"),
    CPlus("Language C++", "Visual Studio"),
    PHP("Psedo language php", "PS Pad");

    private String name;
    private String editor;

     Language(String name, String editor) {
         this.name = name;
         this.editor = editor;
     }

     public void printEditor() {
         System.out.println("Editeur: "+editor);
     }

     public String toString() {
         return name;
     }
}
