def call(Map config) {
    if(env.BUILD_NUMBER.toInteger() % 2 == 0) {
        echo "True"
        return true
    }
    echo "False"
    return false
}
