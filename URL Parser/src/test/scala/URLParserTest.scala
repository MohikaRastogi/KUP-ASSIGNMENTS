package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class URLParserTest extends AnyFlatSpec {

    "A valid URL" should "be correctly parsed into protocol, domain and path" in {
      val url = new URLParser("https://www.mywebsite.com/home")
      val result = URLParser.unapply(url)
      assert(result.contains(("https", "www.mywebsite.com", "home")))
    }

    "A URL with only protocol and domain" should "be correctly parsed into protocol and domain" in {
      val url = new URLParser("https://www.mywebsite.com")
      val result = URLParser.unapply(url)
      assert(result.contains(("https", "www.mywebsite.com", "path not found")))
    }

    "An invalid URL" should "not be parsed" in {
      val url = new URLParser("www.mywebsite.com")
      val result = URLParser.unapply(url)
      assert(result.isEmpty)
    }

    "A URL with more than three components" should "be correctly parsed into protocol, domain and path" in {
      val url = new URLParser("https://www.mywebsite.com/home/articles")
      val result = URLParser.unapply(url)
      assert(result.contains(("https", "www.mywebsite.com", "home/articles")))
    }

    "A URL with no protocol" should "not be parsed" in {
      val url = new URLParser("https://")
      val result = URLParser.unapply(url)
      assert(result.isEmpty)
    }
  }




