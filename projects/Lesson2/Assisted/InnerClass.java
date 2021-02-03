public class InnerClass {
    
    private String myMember1;

    public InnerClass(String myMember1) {
        this.myMember1 = myMember1;
    }

    public String getMyMember1() {
        return myMember1;
    }

    public String useMyInnerClass () {
        MyInnerClass myInnerClass = new MyInnerClass("test2");
        return myInnerClass.getMyMember2();
              
    }

    private class MyInnerClass  {

        private String myMember2;

        public MyInnerClass(String myMember2) {
            this.myMember2 = myMember2;
        }

        public String getMyMember2() {
            return myMember2;
        }
      
    }

    
}
