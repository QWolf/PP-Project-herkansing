import Sprockell.System

prog :: [Instruction]
prog = [	Write Zero (Addr 0),
	Write Zero (Addr 1),
	Write Zero (Addr 2),
	Const 2 RegE,
	Const 3 RegD,
	Compute Add RegE RegD RegD,
	Store RegD (Addr 0),
	Load (Addr 0) RegD,
	Const 4 RegE,
	Compute Sub RegD RegE RegE,
	Store RegE (Addr 4),
	Load (Addr 0) RegE,
	Load (Addr 4) RegD,
	Compute Add RegE RegD RegD,
	Store RegD (Addr 8),
	Const 2 RegD,
	Const 3 RegE,
	Compute Mul RegD RegE RegE,
	Store RegE (Addr 0),
	Load (Addr 8) RegE,
	Const 5 RegD,
	Compute Div RegE RegD RegD,
	Store RegD (Addr 4),
	Load (Addr 0) RegD,
	Load (Addr 4) RegE,
	Compute Mod RegD RegE RegE,
	Store RegE (Addr 8),
	Const 4 RegE,
	Store RegE (Addr 0),
	Const 3 RegE,
	Store RegE (Addr 0),
	Const 4 RegE,
	Compute Incr RegE RegE RegE,
	Store RegE (Addr 0),
	Const 4 RegE,
	Const 8 RegD,
	Compute Add RegE RegD RegE,
	Store RegE (Addr 4),
	Const 3 RegE,
	Compute Decr RegE RegE RegE,
	Store RegE (Addr 0),
	Const 3 RegE,
	Const 6 RegD,
	Compute Sub RegE RegD RegE,
	Store RegE (Addr 4),
	Load (Addr 4) RegE,
	Store RegE (Addr 8),
	Read (Addr 0),
	Receive RegE,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
