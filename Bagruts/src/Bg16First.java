public class Bg16First {

    static class Student {
        private String name;
        private int[] arrTest = {100, 90, 50};

        public double returnAvg() {
            return (this.arrTest[0] + this.arrTest[1] + this.arrTest[2]) / 3.0;
        }
    }

//    class Run {
//        public void bar (Object g ) { g.foo(); }
//    }
//
//    class Z {
//        public void foo() {}
//    }
//
//    class X {
//        public void foo() {}
//    }
//
//    class B {
//        public void foo() {}
//    }

    // תתקבלנה הודעת שגיאה מכיוון ש-foo הוא אינו פונקציה הנמצאת במחלקה Object.
    // ההודעה שתתקבל Cannot resolve method 'foo' in 'Object'


//    class Run2 {
//        public void foo() {}
//        public void bar (B g) { g.foo(); }
//    }
//
//    class Z2 extends B2 {
//        public void foo() {}
//    }
//
//    class Y2 extends B2 {
//        public void foo() {}
//    }
//
//    class X2 extends B2 {
//        public void foo() {}
//    }
//
//    class B2 {
//        public void foo() {}
//    }

}
