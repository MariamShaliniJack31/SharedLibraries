def call(String name, String dayOfWeek) {
  echo "Hello World ${name}. It is ${dayOfWeek}."
}

def calling(Map config = [:]) {
  echo "Hello ${config.name}. It is ${config.dayOfWeek}."
}
