{-# LANGUAGE RecordWildCards #-}

import Sprockell.System

{-
    This program demonstrates how the ordering of access to the shared memory can vary.

    All the sprockells try to write their own letter to the screen at the same time.
    They will all be succeed, but the order in which this happens is undefined.
-}

loopCount = 10

prog :: [Instruction]
prog = [	Const 2147483647 RegE
		, Write RegE (Addr 0)
		, Read (Addr 0)

		, Receive RegA
		, Write RegA stdio
			
			
			         , Nop,Nop,Nop,Nop,Nop,Nop,Nop,Nop,Nop,Nop

		, EndProg
	]


debug :: SystemState -> String
debug SysState{..} | (sharedMem !!! 1) /= 0 = "First shared memaddr equals 0.\n"
debug _ = "-"

main = runDebug debug 3 prog

