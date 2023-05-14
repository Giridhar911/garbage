#Simulate a four/three node Point-To-Point Network and Connect the Links as Follows: 
# n0-n2, n1-n2 and n2-n3. 
# Apply TCP Agent between n0-n3, n1-n3. Apply Relevant Applications over TCP Agents
# by changing the Parameters and Hence Determine the Number of Packets transmitted.

set ns[new Simulator]

set tracefile [open 2.tr w]
$ns trace-all $tracefile

set namfile [open 2.nam w]
$ns namtrace-all $namfile

proc finish{} 
{
    global ns tracefile namfile
    $ns flush-trace
    close $tracefile
    close $namfile
    exec nam 2.nam &
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

set tcp0 [new Agent/TCP]
$ns attach-agent $n0 $tcp0

set sink3 [new Agent/TCPSink]
$ns attach-agent $n3 $sink3
$ns connect $tcp0 $sink3

set tcp1 [new Agent/TCP]
$ns attach-agent $n1 $tcp1

set sink3[new Agent/TCPSink]
$ns attach-agent $n3 $sink3
$ns connect $tcp1 $sink3

set ftp0 [new Application/FTP]
$ftp0 attach-agent $tcp0
$ns at 1.0 "$ftp0 start"
$ns at 10.0 "$ftp0 stop"

set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1
$ns at 1.0 "$ftp1 start"
$ns at 10.0 "$ftp1 stop"

$ns at 11.0 "finish"

$ns run