 
listView('ERERERERER Jobs') {
    description('ERERERERER Jobs')
    jobs {
        regex('ERERERERER_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
