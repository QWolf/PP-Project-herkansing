import Sprockell.System

prog :: [Instruction]
prog = [	Store Zero (Addr 0),
	Const 1 RegE,
	Store RegE (Addr 4),
	Store Zero (Addr 8),
	Const 8 RegE,
	Store RegE (Addr 12),
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
