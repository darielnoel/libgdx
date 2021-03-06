/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ClosestRayResultCallback extends RayResultCallback {
	private long swigCPtr;
	
	protected ClosestRayResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.ClosestRayResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ClosestRayResultCallback, normally you should not need this constructor it's intended for low-level usage. */
	public ClosestRayResultCallback(long cPtr, boolean cMemoryOwn) {
		this("ClosestRayResultCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.ClosestRayResultCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(ClosestRayResultCallback obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_ClosestRayResultCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    CollisionJNI.ClosestRayResultCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    CollisionJNI.ClosestRayResultCallback_change_ownership(this, swigCPtr, true);
  }

  public ClosestRayResultCallback(Vector3 rayFromWorld, Vector3 rayToWorld) {
    this(CollisionJNI.new_ClosestRayResultCallback(rayFromWorld, rayToWorld), true);
    CollisionJNI.ClosestRayResultCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public void setRayFromWorld(btVector3 value) {
    CollisionJNI.ClosestRayResultCallback_rayFromWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getRayFromWorld() {
    long cPtr = CollisionJNI.ClosestRayResultCallback_rayFromWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setRayToWorld(btVector3 value) {
    CollisionJNI.ClosestRayResultCallback_rayToWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getRayToWorld() {
    long cPtr = CollisionJNI.ClosestRayResultCallback_rayToWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setHitNormalWorld(btVector3 value) {
    CollisionJNI.ClosestRayResultCallback_hitNormalWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getHitNormalWorld() {
    long cPtr = CollisionJNI.ClosestRayResultCallback_hitNormalWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setHitPointWorld(btVector3 value) {
    CollisionJNI.ClosestRayResultCallback_hitPointWorld_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getHitPointWorld() {
    long cPtr = CollisionJNI.ClosestRayResultCallback_hitPointWorld_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public float addSingleResult(LocalRayResult rayResult, boolean normalInWorldSpace) {
    return (getClass() == ClosestRayResultCallback.class) ? CollisionJNI.ClosestRayResultCallback_addSingleResult(swigCPtr, this, LocalRayResult.getCPtr(rayResult), rayResult, normalInWorldSpace) : CollisionJNI.ClosestRayResultCallback_addSingleResultSwigExplicitClosestRayResultCallback(swigCPtr, this, LocalRayResult.getCPtr(rayResult), rayResult, normalInWorldSpace);
  }

}
