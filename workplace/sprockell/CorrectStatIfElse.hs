import Sprockell.System

prog :: [Instruction]
prog = [	Write Zero (Addr 0),
	Write Zero (Addr 1),
	Write Zero (Addr 2),
	Store Zero (Addr 0),
	Const 1 RegE,
	Store RegE (Addr 4),
	Store Zero (Addr 8),
	Const 8 RegE,
	Store RegE (Addr 12),
	Load (Addr 4) RegE,
	Branch RegE (Rel 2),
	Jump (Abs 15),
	Const 0 RegE,
	Store RegE (Addr 4),
	Jump (Abs 18),
	Nop,
	Const 1 RegE,
	Store RegE (Addr 4),
	Nop,
	Const 0 RegE,
	Branch RegE (Rel 2),
	Jump (Abs 25),
	Load (Addr 4) RegE,
	Store RegE (Addr 0),
	Jump (Abs 28),
	Nop,
	Const 1 RegE,
	Store RegE (Addr 4),
	Nop,
	Read (Addr 0),
	Receive RegE,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
