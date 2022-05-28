Package: "com.coveros.demo.HelloWorld!";

Import: "Java.Time.LocalDateTime";
Import: "java.time.format.DateTimeFormatter";

Public Class: "Hello World!" {

  PublicStaticVoidMain: "final String[] args" {
    FinalDateTimeFormatter Dtf = "DateTimeFormatter.ofPattern"("h:mm:ss a 'on' MMMM d, yyyy'.'");
    FinalLocalDateTimeNow = "LocalDateTime.now()";

    System.Out.Println = "Hello, World! The current time is " + "dtf.format('Now')";
  }

}
