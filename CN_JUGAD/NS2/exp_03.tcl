#Simulate a four/three node Point-To-Point Network and Connect the Links as Follows: 
#n0-n2, n1-n2 and n2-n3. 
#Apply UDP Agent between n0-n3, n1-n3. 
#Apply Relevant Applications over TCP Agents
#by changing the Parameters and Hence Determine the Number of Packets transmitted.

set ns [new Simulator]

set tracefile [open 3.tr w]
$ns trace-all $tracefile

set namfile [open 3.nam w]
$ns namtrace-all $namfile

proc finish {}
{
    global ns tracefile namfile
    $ns flush-trace
    close $tracefile
    close $namfile
    exec nam 3.nam &
    exit 0
}

set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]

$ns duplex-link $n0 $n2 10.0Mb 1ms DropTail
$ns queue-limit $n0 $n2 10
$ns duplex-link $n1 $n2 10.0Mb 1ms DropTail
$ns queue-limit $n1 $n2 10
$ns duplex-link $n2 $n3 10.0Mb 1ms DropTail
$ns queue-limit $n2 $n3 10

set udp0 [new Agent/UDP]
$ns attach-agent $n0 $udp0

set null3 [new Agent/Null]
$ns attach-agent $n3 $null3
$ns connect $udp0 $null3

set udp1 [new Agent/UDP]
$ns attach-agent $n1 $udp1

set null3 [new Agent/Null]
$ns attach-agent $n3 $null3
$ns connect $udp1 $null3

set cbr0 [new Application/Traffic/CBR]
$cbr0 attach-agent $udp0
$ns at 1.0 "$cbr0 start"
$ns at 10.0 "$cbr0 stop"

set cbr1 [new Application/Traffic/CBR]
$ftp1 attach-agent $udp1
$ns at 1.0 "$cbr1 start"
$ns at 10.0 "$cbr1 stop"

$ns at 11.0 "finish"

$ns run