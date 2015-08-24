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
	Read (Addr 0),
	Receive RegE,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
