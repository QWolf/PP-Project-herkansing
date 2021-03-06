import Sprockell.System

prog :: [Instruction]
prog = [	Write Zero (Addr 0),
	Write Zero (Addr 1),
	Write Zero (Addr 2),
	Const 2 RegE,
	Store RegE (Addr 0),
	Const 4 RegE,
	Store RegE (Addr 4),
	Const 1 RegE,
	Store RegE (Addr 8),
	Const 1 RegE,
	Const 0 RegD,
	Compute Or RegE RegD RegD,
	Store RegD (Addr 12),
	Const 1 RegD,
	Const 0 RegE,
	Compute And RegD RegE RegE,
	Store RegE (Addr 16),
	Const 1 RegE,
	Const 0 RegD,
	Compute Xor RegE RegD RegD,
	Store RegD (Addr 20),
	Const 1 RegD,
	Const 1 RegE,
	Compute Xor RegD RegE RegE,
	Store RegE (Addr 24),
	Const 2 RegE,
	Const 4 RegD,
	Compute Lt RegE RegD RegD,
	Store RegD (Addr 8),
	Const 2 RegD,
	Load (Addr 4) RegE,
	Compute Gt RegD RegE RegE,
	Store RegE (Addr 8),
	Load (Addr 0) RegE,
	Load (Addr 4) RegD,
	Compute LtE RegE RegD RegD,
	Store RegD (Addr 8),
	Load (Addr 0) RegD,
	Const 3 RegE,
	Compute GtE RegD RegE RegE,
	Store RegE (Addr 8),
	Const 2 RegE,
	Const 4 RegD,
	Compute Equal RegE RegD RegD,
	Store RegD (Addr 12),
	Const 2 RegD,
	Load (Addr 0) RegE,
	Compute Equal RegD RegE RegE,
	Store RegE (Addr 12),
	Load (Addr 0) RegE,
	Load (Addr 4) RegD,
	Compute NEq RegE RegD RegD,
	Store RegD (Addr 12),
	Const 1 RegD,
	Const 0 RegE,
	Compute Equal RegD RegE RegE,
	Store RegE (Addr 16),
	Load (Addr 8) RegE,
	Const 1 RegD,
	Compute Equal RegE RegD RegD,
	Store RegD (Addr 20),
	Load (Addr 16) RegD,
	Load (Addr 20) RegE,
	Compute NEq RegD RegE RegE,
	Store RegE (Addr 20),
	Const 1 RegE,
	Store RegE (Addr 24),
	Const 0 RegE,
	Store RegE (Addr 8),
	Read (Addr 0),
	Receive RegE,
	EndProg,
	 Nop]

main = run 1 prog >> putChar '\n'
