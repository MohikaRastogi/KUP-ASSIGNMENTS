package com.knoldus

object Extractor extends App {
  private val urlObject = new URLParser("https://www.mywebsite.com/home")

  // unapply is invoked at the time of pattern matching
  private val result = urlObject match {
    case URLParser(protocol, domain, path) => s"protocol: $protocol\ndomain: $domain\npath: $path"
    case _ => "Invalid url found"
  }
  println(result)
}

