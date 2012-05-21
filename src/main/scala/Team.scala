package models

import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.BasicDBObject
import com.novus.salat.annotations.raw.Key

case class Team(name : String, score : Int) {
}
