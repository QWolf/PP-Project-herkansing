import Sprockell.System

prog :: [Instruction]
prog = [	Store Zero (Addr 0),
	Const 1 RegE,
	Store RegE (Addr 4),
	Store Zero (Addr 8),
	Const 8 RegE,
	Store RegE (Addr 12),
	Load (Addr 0) RegE,
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
	Load (Addr 4) RegE,
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
	Const 1 RegE,
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
	Const 0 RegE,
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
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'