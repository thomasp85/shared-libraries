import org.skat.MyLogic

def call() {
    def myLogic = new MyLogic()
    echo "$(env.GIT_BRANCH)"
}
