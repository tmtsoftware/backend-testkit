package esw.stubs

import akka.Done
import csw.logging.models.Level
import csw.prefix.models.Prefix
import esw.gateway.api.LoggingApi

import scala.concurrent.Future

class LoggerStubImpl extends LoggingApi {
  override def log(prefix: Prefix, level: Level, message: String, metadata: Map[String, Any]): Future[Done] =
    Future.successful(Done)
}
