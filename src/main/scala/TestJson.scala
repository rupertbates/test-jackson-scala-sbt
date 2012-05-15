package main.scala

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.codehaus.jackson.map.ObjectMapper

object TestJson {
  def main(args: Array[String]) = {
    var t = new TestClass("hello")
   //val module = new OptionModule with CaseClassModule
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)

    //om.registerModule(DefaultScalaModule)
    val s = mapper.writeValueAsString(t)
    println(s)
  }
}