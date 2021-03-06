package io.egreen.apistudio.sample

import javax.ws.rs.ApplicationPath

import io.egreen.apistudio.bootstrap.ApiStudio
import io.egreen.apistudio.bootstrap.config.MSApp

/**
  * Created by dewmal on 11/24/16.
  */
@ApplicationPath("/apistudio_sample")
@MSApp(name = "apistudio-sample")
class Main {

  def init(): Unit = {
    ApiStudio.boot(classOf[Main], "0.0.0.0", 7845, "/apistudio_sample")
  }
}

object MainRunner {

  def main(args: Array[String]): Unit = {
    new Main().init()
  }

}
