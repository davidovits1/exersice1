import java.util.Date

fun main(){
    println("d")
}
interface DutiesAndRights{
    fun getCommunityTaxes() : Double

    fun getMaxMoneyFromGMACH() : Double

    fun getNumOfVolunteerHours() : Double
}
 abstract class CommunityMember (_ID: Int, _sexual: Sexual, _name: String,
                                 _address : String, _date : Date): DutiesAndRights {

     abstract var ID : Int
     abstract var sexual : Sexual
     abstract var name : String
     abstract var address : String
     abstract var date : Date
}

enum class Sexual{
    male, female
}