package com.knoldus

import scala.util.Try

class URLParser(val url: String)

object URLParser {
  def unapply(inputUrl: URLParser): Option[(String, String, String)] = {

    // splitting all values separated by '/'
    val valuesArray = inputUrl.url.split("/")

    //removing any empty values from array due to double slashes
    val finalArray = valuesArray.filter(value => value != "")

    //if array size is less than 2, url is not valid,atleast protocol and domain must be present
    Try {
      if (finalArray.length < 2) {
        None

        //url should start with protocol either http or https
      } else if (!(finalArray(0).toString.startsWith("http"))) {
        None

        //if path is not found then the url is valid with protocol and domain
      } else {
        finalArray.length match {
          case 2 =>
            val getProtocol = finalArray(0).split(":")
            val protocol: String = getProtocol(0)
            val domain = finalArray(1)
            inputUrl match {
              case urlMatched => Some(protocol, domain, "path not found")
              case _ => None
            }
          case 3 =>
            val getProtocol = finalArray(0).split(":")
            val protocol = getProtocol(0)
            val domain = finalArray(1)
            val path = finalArray(2)
            inputUrl match {
              case urlMatched => Some(protocol, domain, path)
              case _ => None
            }
          // if array length is greater than 3, then
          // path must have been long and stored at different indexes, so merging the path together
          case _ =>
            val getProtocol = finalArray(0).split(":")
            val protocol = getProtocol(0)
            val domain = finalArray(1)
            val path = finalArray.drop(2).reduceLeft(_ + "/" + _)
            inputUrl match {
              case urlMatched => Some(protocol, domain, path)
              case _ => None
            }
        }
      }
    }.getOrElse(None)
  }
}





