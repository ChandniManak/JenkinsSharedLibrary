def call(String source, String destination){

  sh "scp ${source} ${destination}"

}
