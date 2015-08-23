import Sprockell.System

prog :: [Instruction]
prog = [	Store Zero (Addr 0),
	Const 1 RegE,
	Store RegE (Addr 4),
	Store Zero (Addr 8),
	Const 8 RegE,
	Store RegE (Addr 12),
	Load (Addr 4) RegE,
	Branch RegE (Rel 2),
	Jump (Abs 12),
	Const 0 RegE,
	Store RegE (Addr 4),
	Jump (Abs 15),
	Nop,
	Const 1 RegE,
	Store RegE (Addr 4),
	Nop,
	Const 0 RegE,
	Branch RegE (Rel 2),
	Jump (Abs 22),
	Load (Addr 4) RegE,
	Store RegE (Addr 0),
	Jump (Abs 25),
	Nop,
	Const 1 RegE,
	Store RegE (Addr 4),
	Nop,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
