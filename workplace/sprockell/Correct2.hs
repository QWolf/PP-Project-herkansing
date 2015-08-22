import Sprockell.System

prog :: [Instruction]
prog = [	Store Zero (Addr 0),
	Load (Addr 0) RegE,
	Const 1 RegD,
	Compute NEq RegE RegD RegD,
	Branch RegD (Rel 12),
	Const 102 RegD,
	Write RegD (Addr 16777216),
	Const 97 RegD,
	Write RegD (Addr 16777216),
	Const 108 RegD,
	Write RegD (Addr 16777216),
	Const 115 RegD,
	Write RegD (Addr 16777216),
	Const 101 RegD,
	Write RegD (Addr 16777216),
	Jump (Rel 9),
	Const 116 RegD,
	Write RegD (Addr 16777216),
	Const 114 RegD,
	Write RegD (Addr 16777216),
	Const 117 RegD,
	Write RegD (Addr 16777216),
	Const 101 RegD,
	Write RegD (Addr 16777216),
	Const 10 RegD,
	Write RegD (Addr 16777216),
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
