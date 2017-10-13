package com.xs.my.design.patterns.struceturetype.facade;

/**
 * 外观、门面核心
 */
public class ComputerFacade {

	private Cpu cpu;
	private Memory memory;
	private Disk disk;

	public ComputerFacade() {
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}

	public void start() {
		cpu.start();
		memory.start();
		disk.start();
	}

	public void stop() {
		cpu.stop();
		memory.stop();
		disk.stop();
	}
}
