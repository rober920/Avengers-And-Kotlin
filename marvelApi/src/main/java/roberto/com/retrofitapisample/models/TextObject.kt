package roberto.com.retrofitapisample.models

/**
 * Created by RobertoMiranda on 17/06/2017.
 */
data class TextObject constructor (

    var type: String? = null,
    var language: String? = null,
    var text: String? = null) : BaseModel {
}