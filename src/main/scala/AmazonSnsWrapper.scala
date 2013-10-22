package emailer

import com.amazonaws.services.sns._
import com.amazonaws.services.sns.model._
import com.amazonaws.auth.BasicAWSCredentials

object AmazonSnsWrapper {
  def main(args: Array[String]) : Unit = {
    args match {
      case Array("sendEmail", accessKey, secretKey, message) => {
        val credentials = new BasicAWSCredentials(accessKey, secretKey)
        val client = new AmazonSNSClient(credentials)
        val publishRequest = new PublishRequest("arn:aws:sns:us-east-1:252251679381:benchmarkingCompletions", message, "update")
        val publishResult = client.publish(publishRequest)
        println("Publish Result: " + publishResult.toString)
      }
    }
  }
}