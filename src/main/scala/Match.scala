package models

import java.util.Date
import com.mongodb.casbah.commons.MongoDBObject
import com.mongodb.BasicDBObject
import com.novus.salat.annotations.raw.Key

case class Match(kickOffTime: String, homeTeam: Team, awayTeam: Team){
}

