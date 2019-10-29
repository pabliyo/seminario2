package com.example.seminario2

object Main extends IOApp {
  def run(args: List[String]) =
    Seminario2Server.stream[IO].compile.drain.as(ExitCode.Success)
}