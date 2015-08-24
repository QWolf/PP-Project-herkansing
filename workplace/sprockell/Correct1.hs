import Sprockell.System

prog :: [Instruction]
prog = [	Write Zero (Addr 0),
	Write Zero (Addr 1),
	Write Zero (Addr 2),
	Const 0 RegE,
	Store RegE (Addr 0),
	Const 0 RegE,
	Store RegE (Addr 4),
	Const 1 RegE,
	Store RegE (Addr 8),
	Load (Addr 4) RegE,
	Load (Addr 8) RegD,
	Compute Equal RegE RegD RegD,
	Branch RegD (Rel 2),
	Jump (Abs 45),
	TestAndSet (Addr 1),
	Receive RegD,
	Branch RegD (Rel 2),
	Jump (Rel (-3)),
	Write SPID (Addr 2),
	Const 0 RegD,
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
	Read (Addr 0),
	Receive RegD,
	Write Zero (Addr 1),
	Nop,
	Nop,
	Load (Addr 0) RegD,
	Branch RegD (Abs 50),
	Jump (Abs 117),
	Nop,
	Const 0 RegD,
	Store RegD (Addr 12),
	Load (Addr 12) RegD,
	Const 10 RegE,
	Compute Lt RegD RegE RegE,
	Branch RegE (Rel 2),
	Jump (Abs 63),
	Load (Addr 12) RegE,
	Const 1 RegD,
	Compute Add RegE RegD RegD,
	Store RegD (Addr 12),
	Jump (Abs 115),
	Nop,
	TestAndSet (Addr 1),
	Receive RegD,
	Branch RegD (Rel 2),
	Jump (Rel (-3)),
	Write SPID (Addr 2),
	Load (Addr 12) RegD,
	Const 10 RegE,
	Compute Lt RegD RegE RegE,
	Branch RegE (Rel 12),
	Const 102 RegE,
	Write RegE (Addr 16777216),
	Const 97 RegE,
	Write RegE (Addr 16777216),
	Const 108 RegE,
	Write RegE (Addr 16777216),
	Const 115 RegE,
	Write RegE (Addr 16777216),
	Const 101 RegE,
	Write RegE (Addr 16777216),
	Jump (Rel 9),
	Const 116 RegE,
	Write RegE (Addr 16777216),
	Const 114 RegE,
	Write RegE (Addr 16777216),
	Const 117 RegE,
	Write RegE (Addr 16777216),
	Const 101 RegE,
	Write RegE (Addr 16777216),
	Const 10 RegE,
	Write RegE (Addr 16777216),
	Read (Addr 0),
	Receive RegE,
	Write Zero (Addr 1),
	Const 0 RegE,
	Store RegE (Addr 12),
	Load (Addr 8) RegE,
	Const 1 RegD,
	Compute Xor RegE RegD RegD,
	Branch RegD (Rel 2),
	Jump (Abs 107),
	Const 1 RegD,
	Store RegD (Addr 8),
	Jump (Abs 110),
	Nop,
	Const 1 RegD,
	Store RegD (Addr 4),
	Nop,
	Load (Addr 4) RegD,
	Load (Addr 8) RegE,
	Compute And RegD RegE RegE,
	Store RegE (Addr 0),
	Nop,
	Jump (Abs 46),
	Nop,
	Read (Addr 0),
	Receive RegE,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
